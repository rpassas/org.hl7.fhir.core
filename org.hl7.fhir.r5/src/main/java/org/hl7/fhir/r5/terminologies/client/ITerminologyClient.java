package org.hl7.fhir.r5.terminologies.client;

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


import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.model.Enumerations.FHIRVersion;
import org.hl7.fhir.r5.utils.client.network.ClientHeaders;
import org.hl7.fhir.utilities.FhirPublication;
import org.hl7.fhir.utilities.ToolingClientLogger;

import java.util.EnumSet;
import java.util.Map;

public interface ITerminologyClient {

  EnumSet<FhirPublication> supportableVersions();
  void setAllowedVersions(EnumSet<FhirPublication> versions);
  EnumSet<FhirPublication> getAllowedVersions();
  FhirPublication getActualVersion();
  
  String getId();
  String getAddress();
  String getServerVersion();
  TerminologyCapabilities getTerminologyCapabilities() throws FHIRException;
  ValueSet expandValueset(ValueSet vs, Parameters p, Map<String, String> params) throws FHIRException;
  Parameters validateCS(Parameters pin) throws FHIRException;
  Parameters validateVS(Parameters pin) throws FHIRException;
  ITerminologyClient setTimeoutFactor(int i) throws FHIRException;
  ITerminologyClient setLogger(ToolingClientLogger txLog) throws FHIRException;
  int getRetryCount() throws FHIRException;
  ITerminologyClient setRetryCount(int retryCount) throws FHIRException;
  CapabilityStatement getCapabilitiesStatementQuick() throws FHIRException;
  Parameters lookupCode(Map<String, String> params) throws FHIRException;
  Bundle validateBatch(Bundle batch);
  CanonicalResource read(String type, String id);
  ClientHeaders getClientHeaders();
  ITerminologyClient setClientHeaders(ClientHeaders clientHeaders);
  ITerminologyClient setUserAgent(String userAgent);
  ITerminologyClient setLanguage(String lang);
  String getUserAgent();
}