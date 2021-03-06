package org.imanol.openathon1.payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_ORDER")
public class Order {


	  private @Id @GeneratedValue Long id;

	  private String description;
	  private Status status;

	  Order() {}

	  Order(String description, Status status) {

	    this.description = description;
	    this.status = status;
	  }

	  public Long getId() {
	    return this.id;
	  }

	  public String getDescription() {
	    return this.description;
	  }

	  public Status getStatus() {
	    return this.status;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public void setDescription(String description) {
	    this.description = description;
	  }

	  public void setStatus(Status status) {
	    this.status = status;
	  }

	  

	  @Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	  public String toString() {
	    return "Order{" + "id=" + this.id + ", description='" + this.description + '\'' + ", status=" + this.status + '}';
	  }
}
