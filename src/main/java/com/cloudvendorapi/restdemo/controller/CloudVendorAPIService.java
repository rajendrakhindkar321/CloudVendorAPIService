package com.cloudvendorapi.restdemo.controller;

import com.cloudvendorapi.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudvendor;
@GetMapping("{vendorId}")
public CloudVendor getCloudVendorDetails(String vendorId) {
    return  cloudvendor;

}
@PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {

        this.cloudvendor = cloudvendor;
        return "Cloud Vendor Created Successfully" ;

    }
@PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {

        this.cloudvendor = cloudvendor;
        return "Cloud Vendor Updated Successfully" ;

    }
@DeleteMapping("{vendorId}")
    public String updateCloudVendorDetails(String vendorId  ) {

        this.cloudvendor = null;
        return "Cloud Vendor Deleted Successfully" ;

    }
}
