package database.model;

import java.util.Objects;

public class CategoryEntity {

        private long categoryId;
        private String categoryName;
        private String description;

        public CategoryEntity() {
        }

        public CategoryEntity(long categoryId, String categoryName, String description) {
                this.categoryId = categoryId;
                this.categoryName = categoryName;
                this.description = description;
        }

        public long getCategoryId() {
                return categoryId;
        }

        public void setCategoryId(long categoryId) {
                this.categoryId = categoryId;
        }

        public String getCategoryName() {
                return categoryName;
        }

        public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                }
                if (!(o instanceof CategoryEntity)) {
                        return false;
                }
                CategoryEntity that = (CategoryEntity) o;
                return categoryId == that.categoryId
                        && Objects.equals(categoryName, that.categoryName)
                        && Objects.equals(description, that.description);
        }

        @Override
        public int hashCode() {
                return Objects.hash(categoryId, categoryName, description);
        }

        @Override
        public String toString() {
                return "CategoryEntity{" +
                        "categoryId=" + categoryId +
                        ", categoryName='" + categoryName + '\'' +
                        ", description='" + description + '\'' +
                        '}';
        }
}
