package com.grailsinaction.legacy.db

class SectionToLocation {

    Section section
    Location location
    Date start
    Date end

    static mapping = {
        table 'BK_LOCATION_SECTION_MAP'
        version false

        start column: 'START_DT'
        end column: 'END_DT'
        location column: 'LOCATION_ID'
        section column: 'SECTION_ID'
    }

}
