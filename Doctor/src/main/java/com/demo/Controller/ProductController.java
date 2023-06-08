package com.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.demo.Services.PatientService;
import com.demo.Services.PrescriptionService;
import com.demo.Services.RadiographieService;
import com.demo.entities.Patient;
import com.demo.entities.Prescription;
import com.demo.entities.Radiographie;

@RestController

public class ProductController {

	
	@Autowired
	private PrescriptionService prescriptionService;
	@Autowired
	private RadiographieService radiographieService;
	@Autowired
	private PatientService patientService;

	
	@GetMapping("/")
	public ModelAndView viewHomePage1(Model model) {
		Iterable<Prescription> listprescription = prescriptionService.findAll();
		model.addAttribute("listprescription",listprescription);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("prescription");
		return modelAndView;

	}
	@GetMapping("/pharmacie")
	public ModelAndView viewHomePage3(Model model) {
		Iterable<Prescription> listprescription = prescriptionService.findAll();
		model.addAttribute("listprescription",listprescription);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pharmacie");
		return modelAndView;

	}
	
	@GetMapping("/radiographie")
	public ModelAndView viewHomePage(Model model) {
		Iterable<Radiographie> listradiographie = radiographieService.findAll();
		model.addAttribute("listradiographie",listradiographie);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("radiographie");
		return modelAndView;

	}
	@GetMapping("/patient")
	public ModelAndView viewHomePage2(Model model) {
		Iterable<Patient> listPatient = patientService.findAll();
		model.addAttribute("listPatient",listPatient);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("patient");
		return modelAndView;

	}
	@GetMapping("/patientpharmacie")
	public ModelAndView viewHomePage31(Model model) {
		Iterable<Patient> listPatient = patientService.findAll();
		model.addAttribute("listPatient",listPatient);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("patientpharmacie");
		return modelAndView;

	}
	
	@GetMapping("/add-prescription")
	public ModelAndView showRegistrationForm(Model model) {
		model.addAttribute("prescription", new Prescription());
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("add");
	    return modelAndView;
		
	}
	@GetMapping("/add-Radiographie")
	public ModelAndView showRegistrationForm1(Model model) {
		model.addAttribute("Radiographie", new Radiographie());
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("addRadiographie");
	    return modelAndView;
		
	}
	@GetMapping("/add-patient")
	public ModelAndView showRegistrationForm2(Model model) {
		model.addAttribute("Patient", new Patient());
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("addpatient");
	    return modelAndView;
		
	}
	
	@PostMapping("/process_register")
	public ModelAndView processRegister( Prescription prescription,Model model 	) {
		
		
		prescriptionService.save(prescription);
	
		
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("register_success");
	    return modelAndView;
	}
	@PostMapping("/process_register1")
	public ModelAndView processRegister1( Radiographie radiographie,Model model ) {
		
		
		radiographieService.save(radiographie);
	
		
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("register_success");
	    return modelAndView;
	}
	@PostMapping("/process_register2")
	public ModelAndView processRegister2( Patient patient,Model model ) {
		
		
		patientService.save(patient);
	
		
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("register_success");
	    return modelAndView;
	}
		

	@RequestMapping(value = "findall1", method = RequestMethod.GET, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<Iterable<Radiographie>> findAll() {
		try {
			return new ResponseEntity<Iterable<Radiographie>>(radiographieService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Iterable<Radiographie>>(HttpStatus.BAD_REQUEST);

		}
	}
	@RequestMapping(value = "findall", method = RequestMethod.GET, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<Iterable<Prescription>> findAll2() {
		
			return new ResponseEntity<Iterable<Prescription>>(prescriptionService.findAll(), HttpStatus.OK);
		
			

		}
	@RequestMapping(value = "findallpatient", method = RequestMethod.GET, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<Iterable<Patient>> findAll1() {
		
		try {
			return new ResponseEntity<Iterable<Patient>>(patientService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Iterable<Patient>>(HttpStatus.BAD_REQUEST);

		}
	

		}
	

	@RequestMapping(value = "findRadiographie/{id}", method = RequestMethod.GET, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<Radiographie> find1(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<Radiographie>(radiographieService.find(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Radiographie>(HttpStatus.BAD_REQUEST);

		}
	}




	@RequestMapping(value = "updaterad", method = RequestMethod.PUT, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE }, consumes = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<Radiographie> update(@RequestBody Radiographie radiographie) {
		try {
			radiographieService.save(radiographie);
			return new ResponseEntity<Radiographie>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Radiographie>(HttpStatus.BAD_REQUEST);

		}
	}
	@RequestMapping(value = "updaterad1", method = RequestMethod.POST)
	public ModelAndView update2(@RequestParam("id") long id, @RequestParam("title") String etat, RedirectAttributes redirectAttributes) {
	    try {
	        Prescription prescription = prescriptionService.find(id);
	        prescription.setTitle(etat);
	        prescriptionService.save(prescription);
	        
	        // Add an attribute to the RedirectAttributes object
	        redirectAttributes.addFlashAttribute("message", "Prescription updated successfully!");

	        // Return a RedirectView object with the URL of the new page
	        return new ModelAndView(new RedirectView("add.html"));
	    } catch (Exception e) {
	        return new ModelAndView("error_page");
	    }
	}
	


	

}
