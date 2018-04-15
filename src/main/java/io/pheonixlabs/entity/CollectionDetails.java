package io.pheonixlabs.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by anand on 4/15/2018.
 */
public class CollectionDetails {

    private String teamName;
    private Date creationDate;
    private int modificationCount;
    private Map<String, String> idWithDescription;
    private Map<String, FieldSet> idWithFieldSet;

    public class FieldSet {
        private int length;
        private int order;
        private String name;
        private String value;
        private String dataType;
        private String dataPattern;
        private boolean isEncoded;
        private boolean isSystemGenerated;
        private boolean isMandatory;
        private boolean isParent;

        private List<FieldSet> fieldSetList;

        public FieldSet(int length, int order, String name, String value, String dataType, String dataPattern,
                        boolean isEncoded, boolean isSystemGenerated, boolean isMandatory, boolean isParent) {
            this.length = length;
            this.order = order;
            this.name = name;
            this.value = value;
            this.dataType = dataType;
            this.dataPattern = dataPattern;
            this.isEncoded = isEncoded;
            this.isSystemGenerated = isSystemGenerated;
            this.isMandatory = isMandatory;
            this.isParent = isParent;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public String getDataPattern() {
            return dataPattern;
        }

        public void setDataPattern(String dataPattern) {
            this.dataPattern = dataPattern;
        }

        public boolean isEncoded() {
            return isEncoded;
        }

        public void setEncoded(boolean encoded) {
            isEncoded = encoded;
        }

        public boolean isSystemGenerated() {
            return isSystemGenerated;
        }

        public void setSystemGenerated(boolean systemGenerated) {
            isSystemGenerated = systemGenerated;
        }

        public boolean isMandatory() {
            return isMandatory;
        }

        public void setMandatory(boolean mandatory) {
            isMandatory = mandatory;
        }

        public boolean isParent() {
            return isParent;
        }

        public void setParent(boolean parent) {
            isParent = parent;
        }

        public List<FieldSet> getFieldSetList() {
            return fieldSetList;
        }

        public void setFieldSetList(List<FieldSet> fieldSetList) {
            this.fieldSetList = fieldSetList;
        }
    }
}
