package org.resthub.booking.webapp.t5.services.security;

import java.util.Collections;
import java.util.List;

import org.apache.tapestry5.ioc.internal.util.CollectionFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Object used to store informations about logged user. Internally used by
 * spring-security
 * 
 * @author Baptiste Meurant
 */
public class MyUserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = -492528595540877572L;

	private List<GrantedAuthority> authorities = CollectionFactory.newList();

	private String password;
	private String username;

	public MyUserDetailsImpl(String username) {

		this.username = username;
	}

	/**
	 * {@InheritDoc}
	 */
	public List<GrantedAuthority> getAuthorities() {

		return Collections.unmodifiableList(this.authorities);
	}

	public void addAuthority(GrantedAuthority authority) {

		this.authorities.add(authority);
	}

	/**
	 * {@InheritDoc}
	 */
	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	/**
	 * {@InheritDoc}
	 */
	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	/**
	 * {@InheritDoc}
	 */
	public boolean isAccountNonExpired() {

		return true;
	}

	/**
	 * {@InheritDoc}
	 */
	public boolean isAccountNonLocked() {

		return true;
	}

	/**
	 * {@InheritDoc}
	 */
	public boolean isCredentialsNonExpired() {

		return true;
	}

	/**
	 * {@InheritDoc}
	 */
	public boolean isEnabled() {

		return true;
	}
}
