package database.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class InventoryRecord {

        private long inventoryId;
        private long productId;
        private int quantity;
        private LocalDateTime lastUpdated;

        public InventoryRecord() {
        }

        public InventoryRecord(long inventoryId, long productId, int quantity, LocalDateTime lastUpdated) {
                this.inventoryId = inventoryId;
                this.productId = productId;
                this.quantity = quantity;
                this.lastUpdated = lastUpdated;
        }

        public long getInventoryId() {
                return inventoryId;
        }

        public void setInventoryId(long inventoryId) {
                this.inventoryId = inventoryId;
        }

        public long getProductId() {
                return productId;
        }

        public void setProductId(long productId) {
                this.productId = productId;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public LocalDateTime getLastUpdated() {
                return lastUpdated;
        }

        public void setLastUpdated(LocalDateTime lastUpdated) {
                this.lastUpdated = lastUpdated;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                }
                if (!(o instanceof InventoryRecord)) {
                        return false;
                }
                InventoryRecord that = (InventoryRecord) o;
                return inventoryId == that.inventoryId && productId == that.productId && quantity == that.quantity
                        && Objects.equals(lastUpdated, that.lastUpdated);
        }

        @Override
        public int hashCode() {
                return Objects.hash(inventoryId, productId, quantity, lastUpdated);
        }

        @Override
        public String toString() {
                return "InventoryRecord{" +
                        "inventoryId=" + inventoryId +
                        ", productId=" + productId +
                        ", quantity=" + quantity +
                        ", lastUpdated=" + lastUpdated +
                        '}';
        }
}
