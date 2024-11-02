package edu.wgu.d387_sample_code.TimeZones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimeConversionController {

    @GetMapping("/presentation")
    public ResponseEntity<String> timePresentation() {
        String times = "Presentation time: " + TimeConversion.getTime();
        return new ResponseEntity<String> (times, HttpStatus.OK);
    }
}
