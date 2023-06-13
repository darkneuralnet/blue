package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
/* renamed from: Te8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC36103Te8 extends IInterface {
    /* renamed from: A1 */
    Bundle mo83233A1(String str) throws RemoteException;

    /* renamed from: T3 */
    Bundle mo83232T3(Account account, String str, Bundle bundle) throws RemoteException;

    /* renamed from: X0 */
    Bundle mo83231X0(Account account) throws RemoteException;

    /* renamed from: b4 */
    AccountChangeEventsResponse mo83230b4(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;

    /* renamed from: h3 */
    Bundle mo83229h3(String str, Bundle bundle) throws RemoteException;
}
