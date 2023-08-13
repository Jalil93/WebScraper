package com.searchutilities.testdata;

public class TestData {

        private String domUrl;
        private String domUsername;
        private String domPassword;
        private String waterUrl;
        private String waterUsername;
        private String waterPassword;
        private String gasUrl;
        private String gasUsername;
        private String gasPassword;

        public TestData() {
                domUrl = "https://www.dominionenergy.com/virginia";
                domUsername = "rida05037";
                domPassword = "Jalil1993!";
                waterUrl = null;
                waterUsername = null;
                waterPassword = null;
                gasUrl = null;
                gasUsername = null;
                gasPassword = null;
        }

        public String getDomUrl() {
                return domUrl;
        }

        public void setDomUrl(String domUrl) {
                this.domUrl = domUrl;
        }

        public String getDomUsername() {
                return domUsername;
        }
        public void setDomUsername(String domUsername) {
                this.domUsername = domUsername;
        }

        public String getDomPassword() {
                return domPassword;
        }

        public void setDomPassword(String domPassword) {
                this.domPassword = domPassword;
        }

        public String getWaterUrl() {
                return waterUrl;
        }

        public void setWaterUrl(String waterUrl) {
                this.waterUrl = waterUrl;
        }

        public String getWaterUsername() {
                return waterUsername;
        }

        public void setWaterUsername(String waterUsername) {
                this.waterUsername = waterUsername;
        }

        public String getWaterPassword() {
                return waterPassword;
        }

        public void setWaterPassword(String waterPassword) {
                this.waterPassword = waterPassword;
        }

        public String getGasUrl() {
                return gasUrl;
        }

        public void setGasUrl(String gasUrl) {
                this.gasUrl = gasUrl;
        }

        public String getGasUsername() {
                return gasUsername;
        }

        public void setGasUsername(String gasUsername) {
                this.gasUsername = gasUsername;
        }

        public String getGasPassword() {
                return gasPassword;
        }

        public void setGasPassword(String gasPassword) {
                this.gasPassword = gasPassword;
        }
}