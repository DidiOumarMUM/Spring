package edu.mum.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "PORTFOLIOS")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Portfolio implements java.io.Serializable {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
	private Integer id;

    @Column(name = "BROKERFEES", nullable = false)
	private Integer brokerFees;

    @Column(name = "MARKETFEES", nullable = false)
	private Integer marketFees;
    
    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
	private Client client;
    
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="portfolio")
	private List<PortfolioBalance> portfolioBalances = new ArrayList<PortfolioBalance>();
    
	public Portfolio() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBrokerFees() {
		return brokerFees;
	}

	public void setBrokerFees(Integer brokerFees) {
		this.brokerFees = brokerFees;
	}

	public Integer getMarketFees() {
		return marketFees;
	}

	public void setMarketFees(Integer marketFees) {
		this.marketFees = marketFees;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<PortfolioBalance> getPortfolioBalances() {
		return portfolioBalances;
	}

	public void setPortfolioBalances(List<PortfolioBalance> portfolioBalances) {
		this.portfolioBalances = portfolioBalances;
	}


}
