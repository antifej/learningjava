package database.model;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductEntity {

        private long productId;
        private String productName;
        private String description;
        private BigDecimal price;
        private boolean active;
        private long categoryId;

        public ProductEntity() {
        }

        public ProductEntity(long productId, String productName, String description, BigDecimal price, boolean active, long categoryId) {
                this.productId = productId;
                this.productName = productName;
                this.description = description;
                this.price = price;
                this.active = active;
                this.categoryId = categoryId;
        }

        public long getProductId() {
                return productId;
        }

        public void setProductId(long productId) {
                this.productId = productId;
        }

        public String getProductName() {
                return productName;
        }

        public void setProductName(String productName) {
                this.productName = productName;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

        public boolean isActive() {
                return active;
        }

        public void setActive(boolean active) {
                this.active = active;
        }

        public long getCategoryId() {
                return categoryId;
        }

        public void setCategoryId(long categoryId) {
                this.categoryId = categoryId;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                }
                if (!(o instanceof ProductEntity)) {
                        return false;
                }
                ProductEntity that = (ProductEntity) o;
                return productId == that.productId && active == that.active && categoryId == that.categoryId
                        && Objects.equals(productName, that.productName)
                        && Objects.equals(description, that.description)
                        && Objects.equals(price, that.price);
        }

        @Override
        public int hashCode() {
                return Objects.hash(productId, productName, description, price, active, categoryId);
        }

        @Override
        public String toString() {
                return "ProductEntity{" +
                        "productId=" + productId +
                        ", productName='" + productName + '\'' +
                        ", description='" + description + '\'' +
                        ", price=" + price +
                        ", active=" + active +
                        ", categoryId=" + categoryId +
                        '}';
        }
}
