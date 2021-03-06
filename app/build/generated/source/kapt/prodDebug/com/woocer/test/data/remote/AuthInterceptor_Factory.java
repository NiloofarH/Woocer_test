// Generated by Dagger (https://dagger.dev).
package com.woocer.test.data.remote;

import com.woocer.test.data.sharedPref.UserSharedPref;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthInterceptor_Factory implements Factory<AuthInterceptor> {
  private final Provider<UserSharedPref> userSharedPrefProvider;

  public AuthInterceptor_Factory(Provider<UserSharedPref> userSharedPrefProvider) {
    this.userSharedPrefProvider = userSharedPrefProvider;
  }

  @Override
  public AuthInterceptor get() {
    return newInstance(userSharedPrefProvider.get());
  }

  public static AuthInterceptor_Factory create(Provider<UserSharedPref> userSharedPrefProvider) {
    return new AuthInterceptor_Factory(userSharedPrefProvider);
  }

  public static AuthInterceptor newInstance(UserSharedPref userSharedPref) {
    return new AuthInterceptor(userSharedPref);
  }
}
