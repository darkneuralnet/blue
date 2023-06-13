package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Service;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
interface ServiceManagerBridge {
    YY1<Service.State, Service> servicesByState();
}
