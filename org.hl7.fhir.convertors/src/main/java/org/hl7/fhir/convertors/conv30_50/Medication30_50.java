package org.hl7.fhir.convertors.conv30_50;

import org.hl7.fhir.convertors.VersionConvertor_30_50;
import org.hl7.fhir.exceptions.FHIRException;

public class Medication30_50 {

    public static org.hl7.fhir.r5.model.Medication convertMedication(org.hl7.fhir.dstu3.model.Medication src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Medication tgt = new org.hl7.fhir.r5.model.Medication();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasCode())
            tgt.setCode(VersionConvertor_30_50.convertCodeableConcept(src.getCode()));
        if (src.hasStatus())
            tgt.setStatusElement(convertMedicationStatus(src.getStatusElement()));
        if (src.hasManufacturer())
            tgt.setSponsor(VersionConvertor_30_50.convertReference(src.getManufacturer()));
        if (src.hasForm())
            tgt.setDoseForm(VersionConvertor_30_50.convertCodeableConcept(src.getForm()));
        for (org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent t : src.getIngredient()) tgt.addIngredient(convertMedicationIngredientComponent(t));
        if (src.hasPackage())
            tgt.setBatch(convertMedicationPackageBatchComponent(src.getPackage().getBatchFirstRep()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Medication convertMedication(org.hl7.fhir.r5.model.Medication src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Medication tgt = new org.hl7.fhir.dstu3.model.Medication();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasCode())
            tgt.setCode(VersionConvertor_30_50.convertCodeableConcept(src.getCode()));
        if (src.hasStatus())
            tgt.setStatusElement(convertMedicationStatus(src.getStatusElement()));
        if (src.hasSponsor())
            tgt.setManufacturer(VersionConvertor_30_50.convertReference(src.getSponsor()));
        if (src.hasDoseForm())
            tgt.setForm(VersionConvertor_30_50.convertCodeableConcept(src.getDoseForm()));
        for (org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent t : src.getIngredient()) tgt.addIngredient(convertMedicationIngredientComponent(t));
        if (src.hasBatch())
            tgt.getPackage().addBatch(convertMedicationPackageBatchComponent(src.getBatch()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent convertMedicationIngredientComponent(org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.getItem().hasConcept())
          tgt.setItem(VersionConvertor_30_50.convertType(src.getItem().getConcept()));
        if (src.getItem().hasReference())
          tgt.setItem(VersionConvertor_30_50.convertType(src.getItem().getReference()));
        if (src.hasIsActive())
            tgt.setIsActiveElement(VersionConvertor_30_50.convertBoolean(src.getIsActiveElement()));
        if (src.hasStrengthRatio())
            tgt.setAmount(VersionConvertor_30_50.convertRatio(src.getStrengthRatio()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent convertMedicationIngredientComponent(org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent tgt = new org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasItemCodeableConcept())
            tgt.getItem().setConcept(VersionConvertor_30_50.convertCodeableConcept(src.getItemCodeableConcept()));
        if (src.hasItemReference())
          tgt.getItem().setReference(VersionConvertor_30_50.convertReference(src.getItemReference()));
        if (src.hasIsActive())
            tgt.setIsActiveElement(VersionConvertor_30_50.convertBoolean(src.getIsActiveElement()));
        if (src.hasAmount())
            tgt.setStrength(VersionConvertor_30_50.convertRatio(src.getAmount()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Medication.MedicationPackageBatchComponent convertMedicationPackageBatchComponent(org.hl7.fhir.r5.model.Medication.MedicationBatchComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Medication.MedicationPackageBatchComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationPackageBatchComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasLotNumber())
            tgt.setLotNumberElement(VersionConvertor_30_50.convertString(src.getLotNumberElement()));
        if (src.hasExpirationDate())
            tgt.setExpirationDateElement(VersionConvertor_30_50.convertDateTime(src.getExpirationDateElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Medication.MedicationBatchComponent convertMedicationPackageBatchComponent(org.hl7.fhir.dstu3.model.Medication.MedicationPackageBatchComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Medication.MedicationBatchComponent tgt = new org.hl7.fhir.r5.model.Medication.MedicationBatchComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasLotNumber())
            tgt.setLotNumberElement(VersionConvertor_30_50.convertString(src.getLotNumberElement()));
        if (src.hasExpirationDate())
            tgt.setExpirationDateElement(VersionConvertor_30_50.convertDateTime(src.getExpirationDateElement()));
        return tgt;
    }

    static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Medication.MedicationStatusCodes> convertMedicationStatus(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Medication.MedicationStatus> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Medication.MedicationStatusCodes> tgt = new org.hl7.fhir.r5.model.Enumeration<>(new org.hl7.fhir.r5.model.Medication.MedicationStatusCodesEnumFactory());
        VersionConvertor_30_50.copyElement(src, tgt);
        switch(src.getValue()) {
            case ACTIVE:
                tgt.setValue(org.hl7.fhir.r5.model.Medication.MedicationStatusCodes.ACTIVE);
                break;
            case INACTIVE:
                tgt.setValue(org.hl7.fhir.r5.model.Medication.MedicationStatusCodes.INACTIVE);
                break;
            case ENTEREDINERROR:
                tgt.setValue(org.hl7.fhir.r5.model.Medication.MedicationStatusCodes.ENTEREDINERROR);
                break;
            default:
                tgt.setValue(org.hl7.fhir.r5.model.Medication.MedicationStatusCodes.NULL);
                break;
        }
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Medication.MedicationStatus> convertMedicationStatus(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Medication.MedicationStatusCodes> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Medication.MedicationStatus> tgt = new org.hl7.fhir.dstu3.model.Enumeration<>(new org.hl7.fhir.dstu3.model.Medication.MedicationStatusEnumFactory());
        VersionConvertor_30_50.copyElement(src, tgt);
        switch(src.getValue()) {
            case ACTIVE:
                tgt.setValue(org.hl7.fhir.dstu3.model.Medication.MedicationStatus.ACTIVE);
                break;
            case INACTIVE:
                tgt.setValue(org.hl7.fhir.dstu3.model.Medication.MedicationStatus.INACTIVE);
                break;
            case ENTEREDINERROR:
                tgt.setValue(org.hl7.fhir.dstu3.model.Medication.MedicationStatus.ENTEREDINERROR);
                break;
            default:
                tgt.setValue(org.hl7.fhir.dstu3.model.Medication.MedicationStatus.NULL);
                break;
        }
        return tgt;
    }
}