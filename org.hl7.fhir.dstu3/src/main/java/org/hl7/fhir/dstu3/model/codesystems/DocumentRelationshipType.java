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

public enum DocumentRelationshipType {

        /**
         * This document logically replaces or supersedes the target document.
         */
        REPLACES, 
        /**
         * This document was generated by transforming the target document (e.g. format or language conversion).
         */
        TRANSFORMS, 
        /**
         * This document is a signature of the target document.
         */
        SIGNS, 
        /**
         * This document adds additional information to the target document.
         */
        APPENDS, 
        /**
         * added to help the parsers
         */
        NULL;
        public static DocumentRelationshipType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("replaces".equals(codeString))
          return REPLACES;
        if ("transforms".equals(codeString))
          return TRANSFORMS;
        if ("signs".equals(codeString))
          return SIGNS;
        if ("appends".equals(codeString))
          return APPENDS;
        throw new FHIRException("Unknown DocumentRelationshipType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case REPLACES: return "replaces";
            case TRANSFORMS: return "transforms";
            case SIGNS: return "signs";
            case APPENDS: return "appends";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/document-relationship-type";
        }
        public String getDefinition() {
          switch (this) {
            case REPLACES: return "This document logically replaces or supersedes the target document.";
            case TRANSFORMS: return "This document was generated by transforming the target document (e.g. format or language conversion).";
            case SIGNS: return "This document is a signature of the target document.";
            case APPENDS: return "This document adds additional information to the target document.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case REPLACES: return "Replaces";
            case TRANSFORMS: return "Transforms";
            case SIGNS: return "Signs";
            case APPENDS: return "Appends";
            default: return "?";
          }
    }


}

