﻿package org.hl7.fhir.dstu3.model.codesystems;




/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sat, Mar 25, 2017 21:03-0400 for FHIR v3.0.0


import org.hl7.fhir.exceptions.FHIRException;

public enum ObservationCategory {

        /**
         * The Social History Observations define the patient's occupational, personal (e.g. lifestyle), social, and environmental history and health risk factors, as well as administrative data such as marital status, race, ethnicity and religious affiliation.
         */
        SOCIALHISTORY, 
        /**
         *  Clinical observations measure the body's basic functions such as such as blood pressure, heart rate, respiratory rate, height, weight, body mass index, head circumference, pulse oximetry, temperature, and body surface area.
         */
        VITALSIGNS, 
        /**
         * Observations generated by imaging. The scope includes observations, plain x-ray, ultrasound, CT, MRI, angiography, echocardiography, nuclear medicine.
         */
        IMAGING, 
        /**
         * The results of observations generated by laboratories.  Laboratory results are typically generated by laboratories providing analytic services in areas such as chemistry, hematology, serology, histology, cytology, anatomic pathology, microbiology, and/or virology. These observations are based on analysis of specimens obtained from the patient and submitted to the laboratory.
         */
        LABORATORY, 
        /**
         * Observations generated by other procedures.  This category includes observations resulting from interventional and non-interventional procedures excluding lab and imaging (e.g. cardiology catheterization, endoscopy, electrodiagnostics, etc.).  Procedure results are typically generated by a clinician to provide more granular information about component observations made during a procedure, such as where a gastroenterologist reports the size of a polyp observed during a colonoscopy.
         */
        PROCEDURE, 
        /**
         * Assessment tool/survey instrument observations (e.g. Apgar Scores, Montreal Cognitive Assessment (MoCA))
         */
        SURVEY, 
        /**
         * Observations generated by physical exam findings including direct observations made by a clinician and use of simple instruments and the result of simple maneuvers performed directly on the patient's body.
         */
        EXAM, 
        /**
         * Observations generated by non-interventional treatment protocols (e.g. occupational, physical, radiation, nutritional and medication therapy)
         */
        THERAPY, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ObservationCategory fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("social-history".equals(codeString))
          return SOCIALHISTORY;
        if ("vital-signs".equals(codeString))
          return VITALSIGNS;
        if ("imaging".equals(codeString))
          return IMAGING;
        if ("laboratory".equals(codeString))
          return LABORATORY;
        if ("procedure".equals(codeString))
          return PROCEDURE;
        if ("survey".equals(codeString))
          return SURVEY;
        if ("exam".equals(codeString))
          return EXAM;
        if ("therapy".equals(codeString))
          return THERAPY;
        throw new FHIRException("Unknown ObservationCategory code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case SOCIALHISTORY: return "social-history";
            case VITALSIGNS: return "vital-signs";
            case IMAGING: return "imaging";
            case LABORATORY: return "laboratory";
            case PROCEDURE: return "procedure";
            case SURVEY: return "survey";
            case EXAM: return "exam";
            case THERAPY: return "therapy";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/observation-category";
        }
        public String getDefinition() {
          switch (this) {
            case SOCIALHISTORY: return "The Social History Observations define the patient's occupational, personal (e.g. lifestyle), social, and environmental history and health risk factors, as well as administrative data such as marital status, race, ethnicity and religious affiliation.";
            case VITALSIGNS: return " Clinical observations measure the body's basic functions such as such as blood pressure, heart rate, respiratory rate, height, weight, body mass index, head circumference, pulse oximetry, temperature, and body surface area.";
            case IMAGING: return "Observations generated by imaging. The scope includes observations, plain x-ray, ultrasound, CT, MRI, angiography, echocardiography, nuclear medicine.";
            case LABORATORY: return "The results of observations generated by laboratories.  Laboratory results are typically generated by laboratories providing analytic services in areas such as chemistry, hematology, serology, histology, cytology, anatomic pathology, microbiology, and/or virology. These observations are based on analysis of specimens obtained from the patient and submitted to the laboratory.";
            case PROCEDURE: return "Observations generated by other procedures.  This category includes observations resulting from interventional and non-interventional procedures excluding lab and imaging (e.g. cardiology catheterization, endoscopy, electrodiagnostics, etc.).  Procedure results are typically generated by a clinician to provide more granular information about component observations made during a procedure, such as where a gastroenterologist reports the size of a polyp observed during a colonoscopy.";
            case SURVEY: return "Assessment tool/survey instrument observations (e.g. Apgar Scores, Montreal Cognitive Assessment (MoCA))";
            case EXAM: return "Observations generated by physical exam findings including direct observations made by a clinician and use of simple instruments and the result of simple maneuvers performed directly on the patient's body.";
            case THERAPY: return "Observations generated by non-interventional treatment protocols (e.g. occupational, physical, radiation, nutritional and medication therapy)";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case SOCIALHISTORY: return "Social History";
            case VITALSIGNS: return "Vital Signs";
            case IMAGING: return "Imaging";
            case LABORATORY: return "Laboratory";
            case PROCEDURE: return "Procedure";
            case SURVEY: return "Survey";
            case EXAM: return "Exam";
            case THERAPY: return "Therapy";
            default: return "?";
          }
    }


}

