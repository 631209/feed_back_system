package com.cognizant.FeedBackSystem.mapper;

import com.cognizant.FeedBackSystem.dto.excel.OutreachEventInformationExcel;
import com.cognizant.FeedBackSystem.dto.excel.OutreachEventSummaryExcel;
import com.cognizant.FeedBackSystem.dto.excel.VolunteerEnrollmentDetailsNotAttendExcel;
import com.cognizant.FeedBackSystem.dto.excel.VolunteerEnrollmentDetailsUnregisteredExcel;
import com.cognizant.FeedBackSystem.entity.OutreachEventInformation;
import com.cognizant.FeedBackSystem.entity.OutreachEventSummary;
import com.cognizant.FeedBackSystem.entity.VolunteerEnrollmentDetailsNotAttend;
import com.cognizant.FeedBackSystem.entity.VolunteerEnrollmentDetailsUnregistered;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-31T19:50:26+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class ExcelToDtoObjMapperImpl implements ExcelToDtoObjMapper {

    @Override
    public OutreachEventInformation getObj(OutreachEventInformationExcel outreachEventInformationExcel) {
        if ( outreachEventInformationExcel == null ) {
            return null;
        }

        OutreachEventInformation outreachEventInformation = new OutreachEventInformation();

        outreachEventInformation.setEventId( outreachEventInformationExcel.getEventId() );
        outreachEventInformation.setBaseLocation( outreachEventInformationExcel.getBaseLocation() );
        outreachEventInformation.setBeneficiaryName( outreachEventInformationExcel.getBeneficiaryName() );
        outreachEventInformation.setCouncilName( outreachEventInformationExcel.getCouncilName() );
        outreachEventInformation.setEventName( outreachEventInformationExcel.getEventName() );
        outreachEventInformation.setEventDescription( outreachEventInformationExcel.getEventDescription() );
        outreachEventInformation.setEventDate( outreachEventInformationExcel.getEventDate() );
        outreachEventInformation.setEmployeeId( outreachEventInformationExcel.getEmployeeId() );
        outreachEventInformation.setEmployeeName( outreachEventInformationExcel.getEmployeeName() );
        outreachEventInformation.setVolunteerHours( outreachEventInformationExcel.getVolunteerHours() );
        outreachEventInformation.setTravelHours( outreachEventInformationExcel.getTravelHours() );
        outreachEventInformation.setLivesImpacted( outreachEventInformationExcel.getLivesImpacted() );
        outreachEventInformation.setBusinessUnit( outreachEventInformationExcel.getBusinessUnit() );
        outreachEventInformation.setStatus( outreachEventInformationExcel.getStatus() );
        outreachEventInformation.setIIEPcategory( outreachEventInformationExcel.getIIEPcategory() );

        return outreachEventInformation;
    }

    @Override
    public OutreachEventSummary getObj(OutreachEventSummaryExcel outreachEventSummaryExcel) {
        if ( outreachEventSummaryExcel == null ) {
            return null;
        }

        OutreachEventSummary outreachEventSummary = new OutreachEventSummary();

        outreachEventSummary.setEventId( outreachEventSummaryExcel.getEventId() );
        outreachEventSummary.setMonth( outreachEventSummaryExcel.getMonth() );
        outreachEventSummary.setBaseLocation( outreachEventSummaryExcel.getBaseLocation() );
        outreachEventSummary.setBeneficiaryName( outreachEventSummaryExcel.getBeneficiaryName() );
        outreachEventSummary.setVenuAddress( outreachEventSummaryExcel.getVenuAddress() );
        outreachEventSummary.setCouncilName( outreachEventSummaryExcel.getCouncilName() );
        outreachEventSummary.setProject( outreachEventSummaryExcel.getProject() );
        outreachEventSummary.setCategory( outreachEventSummaryExcel.getCategory() );
        outreachEventSummary.setEventName( outreachEventSummaryExcel.getEventName() );
        outreachEventSummary.setEventDescription( outreachEventSummaryExcel.getEventDescription() );
        outreachEventSummary.setEventDate( outreachEventSummaryExcel.getEventDate() );
        outreachEventSummary.setTotalNoOfVolunteers( outreachEventSummaryExcel.getTotalNoOfVolunteers() );
        outreachEventSummary.setTotalvolunteerHours( outreachEventSummaryExcel.getTotalvolunteerHours() );
        outreachEventSummary.setTotalTravelHours( outreachEventSummaryExcel.getTotalTravelHours() );
        outreachEventSummary.setOverAllVolunteeringHours( outreachEventSummaryExcel.getOverAllVolunteeringHours() );
        outreachEventSummary.setLivesImpacted( outreachEventSummaryExcel.getLivesImpacted() );
        outreachEventSummary.setActivityType( outreachEventSummaryExcel.getActivityType() );
        outreachEventSummary.setStatus( outreachEventSummaryExcel.getStatus() );
        outreachEventSummary.setPOC_ID( outreachEventSummaryExcel.getPOC_ID() );
        outreachEventSummary.setPOC_name( outreachEventSummaryExcel.getPOC_name() );
        outreachEventSummary.setPOC_Contact_name( outreachEventSummaryExcel.getPOC_Contact_name() );

        return outreachEventSummary;
    }

    @Override
    public VolunteerEnrollmentDetailsNotAttend getObj(VolunteerEnrollmentDetailsNotAttendExcel volunteerEnrollmentDetailsNotAttendExcel) {
        if ( volunteerEnrollmentDetailsNotAttendExcel == null ) {
            return null;
        }

        VolunteerEnrollmentDetailsNotAttend volunteerEnrollmentDetailsNotAttend = new VolunteerEnrollmentDetailsNotAttend();

        volunteerEnrollmentDetailsNotAttend.setEventId( volunteerEnrollmentDetailsNotAttendExcel.getEventId() );
        volunteerEnrollmentDetailsNotAttend.setEventName( volunteerEnrollmentDetailsNotAttendExcel.getEventName() );
        volunteerEnrollmentDetailsNotAttend.setBeneficiaryName( volunteerEnrollmentDetailsNotAttendExcel.getBeneficiaryName() );
        volunteerEnrollmentDetailsNotAttend.setBaseLocation( volunteerEnrollmentDetailsNotAttendExcel.getBaseLocation() );
        volunteerEnrollmentDetailsNotAttend.setEventDate( volunteerEnrollmentDetailsNotAttendExcel.getEventDate() );
        volunteerEnrollmentDetailsNotAttend.setEmployeeId( volunteerEnrollmentDetailsNotAttendExcel.getEmployeeId() );

        return volunteerEnrollmentDetailsNotAttend;
    }

    @Override
    public VolunteerEnrollmentDetailsUnregistered getObj(VolunteerEnrollmentDetailsUnregisteredExcel volunteerEnrollmentDetailsUnregisteredExcel) {
        if ( volunteerEnrollmentDetailsUnregisteredExcel == null ) {
            return null;
        }

        VolunteerEnrollmentDetailsUnregistered volunteerEnrollmentDetailsUnregistered = new VolunteerEnrollmentDetailsUnregistered();

        volunteerEnrollmentDetailsUnregistered.setEventId( volunteerEnrollmentDetailsUnregisteredExcel.getEventId() );
        volunteerEnrollmentDetailsUnregistered.setEventName( volunteerEnrollmentDetailsUnregisteredExcel.getEventName() );
        volunteerEnrollmentDetailsUnregistered.setBeneficiaryName( volunteerEnrollmentDetailsUnregisteredExcel.getBeneficiaryName() );
        volunteerEnrollmentDetailsUnregistered.setBaseLocation( volunteerEnrollmentDetailsUnregisteredExcel.getBaseLocation() );
        volunteerEnrollmentDetailsUnregistered.setEventDate( volunteerEnrollmentDetailsUnregisteredExcel.getEventDate() );
        volunteerEnrollmentDetailsUnregistered.setEmployeeId( volunteerEnrollmentDetailsUnregisteredExcel.getEmployeeId() );

        return volunteerEnrollmentDetailsUnregistered;
    }
}
