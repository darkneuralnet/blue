package com.google.android.filament.utils;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a\u000e\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004\u001a\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0086\b\u001a\u001e\u0010\"\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000e\u001a\u001e\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000e\u001a(\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a(\u0010$\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a(\u0010$\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a\u0015\u0010'\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010'\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010'\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010(\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010(\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010(\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010(\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010)\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010)\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010*\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010*\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010*\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010+\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010+\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010,\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010,\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010,\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010-\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010-\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010-\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010.\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010.\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010.\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010.\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010/\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010/\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, m28432d2 = {"abs", "Lcom/google/android/filament/utils/Float2;", "v", "Lcom/google/android/filament/utils/Float3;", "Lcom/google/android/filament/utils/Float4;", "all", "", "Lcom/google/android/filament/utils/Bool2;", "Lcom/google/android/filament/utils/Bool3;", "Lcom/google/android/filament/utils/Bool4;", "any", "clamp", "min", "max", "", "cross", C17296a.f69688o, "b", "distance", "dot", "equal", "greaterThan", "greaterThanEqual", "length", "length2", "lessThan", "lessThanEqual", "mix", "x", "normalize", "notEqual", "reflect", "i", "n", "refract", "eta", "transform", "block", "Lkotlin/Function1;", "div", "eq", "gt", "gte", "lt", "lte", "minus", "neq", "plus", "times", "filament-utils-android_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float2\n+ 3 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n+ 5 Vector.kt\ncom/google/android/filament/utils/Float4\n*L\n1#1,1280:1\n570#1:1282\n570#1:1283\n573#1:1284\n566#1:1285\n573#1:1287\n566#1:1289\n656#1:1303\n656#1:1304\n659#1:1305\n652#1:1306\n659#1:1308\n652#1:1310\n752#1:1329\n752#1:1330\n129#2:1281\n129#2:1286\n129#2:1290\n134#2,3:1299\n43#3:1288\n31#3:1291\n31#3:1292\n31#3:1293\n31#3:1294\n35#3:1295\n35#3:1296\n35#3:1297\n35#3:1298\n43#3:1309\n31#3:1312\n31#3:1313\n31#3:1314\n31#3:1315\n31#3:1316\n31#3:1317\n35#3:1318\n35#3:1319\n35#3:1320\n35#3:1321\n35#3:1322\n35#3:1323\n31#3:1331\n31#3:1332\n31#3:1333\n31#3:1334\n31#3:1335\n31#3:1336\n31#3:1337\n31#3:1338\n35#3:1339\n35#3:1340\n35#3:1341\n35#3:1342\n35#3:1343\n35#3:1344\n35#3:1345\n35#3:1346\n301#4:1302\n301#4:1307\n301#4:1311\n306#4,4:1324\n549#5:1328\n554#5,5:1347\n341#5:1352\n*S KotlinDebug\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/VectorKt\n*L\n572#1:1282\n575#1:1283\n579#1:1284\n579#1:1285\n581#1:1287\n583#1:1289\n658#1:1303\n667#1:1304\n671#1:1305\n671#1:1306\n673#1:1308\n675#1:1310\n754#1:1329\n757#1:1330\n572#1:1281\n579#1:1286\n583#1:1290\n619#1:1299,3\n582#1:1288\n588#1:1291\n589#1:1292\n595#1:1293\n596#1:1294\n602#1:1295\n603#1:1296\n609#1:1297\n610#1:1298\n674#1:1309\n680#1:1312\n681#1:1313\n682#1:1314\n688#1:1315\n689#1:1316\n690#1:1317\n696#1:1318\n697#1:1319\n698#1:1320\n704#1:1321\n705#1:1322\n706#1:1323\n763#1:1331\n764#1:1332\n765#1:1333\n766#1:1334\n772#1:1335\n773#1:1336\n774#1:1337\n775#1:1338\n781#1:1339\n782#1:1340\n783#1:1341\n784#1:1342\n790#1:1343\n791#1:1344\n792#1:1345\n793#1:1346\n658#1:1302\n671#1:1307\n675#1:1311\n715#1:1324,4\n754#1:1328\n805#1:1347,5\n820#1:1352\n*E\n"})
/* loaded from: classes5.dex */
public final class VectorKt {
    public static final Float2 abs(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(Math.abs(v.getX()), Math.abs(v.getY()));
    }

    public static final boolean all(Bool2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() && v.getY();
    }

    public static final boolean any(Bool2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() || v.getY();
    }

    public static final Float2 clamp(Float2 v, float f, float f2) {
        Intrinsics.checkNotNullParameter(v, "v");
        float x = v.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = v.getY();
        if (y >= f) {
            f = y > f2 ? f2 : y;
        }
        return new Float2(x, f);
    }

    public static final Float3 cross(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float3((a.getY() * b.getZ()) - (a.getZ() * b.getY()), (a.getZ() * b.getX()) - (a.getX() * b.getZ()), (a.getX() * b.getY()) - (a.getY() * b.getX()));
    }

    public static final float distance(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Float2 float2 = new Float2(a.getX() - b.getX(), a.getY() - b.getY());
        return (float) Math.sqrt((float2.getX() * float2.getX()) + (float2.getY() * float2.getY()));
    }

    public static final Float2 div(float f, Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(f / v.getX(), f / v.getY());
    }

    public static final float dot(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return (a.getX() * b.getX()) + (a.getY() * b.getY());
    }

    /* renamed from: eq */
    public static final Bool2 m51922eq(Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() == f, float2.getY() == f);
    }

    public static final Bool2 equal(Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() == f, a.getY() == f);
    }

    public static final Bool2 greaterThan(Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() > f, a.getY() > f);
    }

    public static final Bool2 greaterThanEqual(Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() >= f, a.getY() >= f);
    }

    /* renamed from: gt */
    public static final Bool2 m51916gt(Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() > f, float2.getY() > f);
    }

    public static final Bool2 gte(Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() >= f, float2.getY() >= f);
    }

    public static final float length(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY()));
    }

    public static final float length2(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (v.getX() * v.getX()) + (v.getY() * v.getY());
    }

    public static final Bool2 lessThan(Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() < f, a.getY() < f);
    }

    public static final Bool2 lessThanEqual(Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() <= f, a.getY() <= f);
    }

    /* renamed from: lt */
    public static final Bool2 m51910lt(Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() < f, float2.getY() < f);
    }

    public static final Bool2 lte(Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() <= f, float2.getY() <= f);
    }

    public static final float max(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.max(v.getX(), v.getY());
    }

    public static final float min(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.min(v.getX(), v.getY());
    }

    public static final Float2 minus(float f, Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(f - v.getX(), f - v.getY());
    }

    public static final Float2 mix(Float2 a, Float2 b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float f2 = 1.0f - f;
        return new Float2((a.getX() * f2) + (b.getX() * f), (a.getY() * f2) + (b.getY() * f));
    }

    public static final Bool2 neq(Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(!(float2.getX() == f), !(float2.getY() == f));
    }

    public static final Float2 normalize(Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float sqrt = 1.0f / ((float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY())));
        return new Float2(v.getX() * sqrt, v.getY() * sqrt);
    }

    public static final Bool2 notEqual(Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(!(a.getX() == f), !(a.getY() == f));
    }

    public static final Float2 plus(float f, Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(v.getX() + f, f + v.getY());
    }

    public static final Float2 reflect(Float2 i, Float2 n) {
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(n, "n");
        float x = ((n.getX() * i.getX()) + (n.getY() * i.getY())) * 2.0f;
        Float2 float2 = new Float2(n.getX() * x, x * n.getY());
        return new Float2(i.getX() - float2.getX(), i.getY() - float2.getY());
    }

    public static final Float2 refract(Float2 i, Float2 n, float f) {
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(n, "n");
        float x = (n.getX() * i.getX()) + (n.getY() * i.getY());
        float f2 = 1.0f - ((f * f) * (1.0f - (x * x)));
        if (f2 < 0.0f) {
            return new Float2(0.0f);
        }
        Float2 float2 = new Float2(i.getX() * f, i.getY() * f);
        float sqrt = (f * x) + ((float) Math.sqrt(f2));
        Float2 float22 = new Float2(n.getX() * sqrt, sqrt * n.getY());
        return new Float2(float2.getX() - float22.getX(), float2.getY() - float22.getY());
    }

    public static final Float2 times(float f, Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(v.getX() * f, f * v.getY());
    }

    public static final Float2 transform(Float2 v, Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        Float2 copy$default = Float2.copy$default(v, 0.0f, 0.0f, 3, null);
        copy$default.setX(block.invoke(Float.valueOf(copy$default.getX())).floatValue());
        copy$default.setY(block.invoke(Float.valueOf(copy$default.getY())).floatValue());
        return copy$default;
    }

    /* renamed from: x */
    public static final Float3 m51904x(Float3 float3, Float3 v) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3((float3.getY() * v.getZ()) - (float3.getZ() * v.getY()), (float3.getZ() * v.getX()) - (float3.getX() * v.getZ()), (float3.getX() * v.getY()) - (float3.getY() * v.getX()));
    }

    public static final Float3 abs(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(Math.abs(v.getX()), Math.abs(v.getY()), Math.abs(v.getZ()));
    }

    public static final boolean all(Bool3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() && v.getY() && v.getZ();
    }

    public static final boolean any(Bool3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() || v.getY() || v.getZ();
    }

    public static final Float3 div(float f, Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(f / v.getX(), f / v.getY(), f / v.getZ());
    }

    public static final float dot(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ());
    }

    /* renamed from: eq */
    public static final Bool2 m51921eq(Float2 float2, Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() == b.getX(), float2.getY() == b.getY());
    }

    public static final Bool2 equal(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() == b.getX(), a.getY() == b.getY());
    }

    public static final Bool2 greaterThan(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() > b.getY(), a.getY() > b.getY());
    }

    public static final Bool2 greaterThanEqual(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() >= b.getX(), a.getY() >= b.getY());
    }

    /* renamed from: gt */
    public static final Bool2 m51915gt(Float2 float2, Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() > b.getX(), float2.getY() > b.getY());
    }

    public static final Bool2 gte(Float2 float2, Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() >= b.getX(), float2.getY() >= b.getY());
    }

    public static final float length(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ()));
    }

    public static final float length2(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ());
    }

    public static final Bool2 lessThan(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() < b.getX(), a.getY() < b.getY());
    }

    public static final Bool2 lessThanEqual(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() <= b.getX(), a.getY() <= b.getY());
    }

    /* renamed from: lt */
    public static final Bool2 m51909lt(Float2 float2, Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() < b.getX(), float2.getY() < b.getY());
    }

    public static final Bool2 lte(Float2 float2, Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() <= b.getX(), float2.getY() <= b.getY());
    }

    public static final Float2 max(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float2(Math.max(a.getX(), b.getX()), Math.max(a.getY(), b.getY()));
    }

    public static final Float2 min(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float2(Math.min(a.getX(), b.getX()), Math.min(a.getY(), b.getY()));
    }

    public static final Float3 minus(float f, Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(f - v.getX(), f - v.getY(), f - v.getZ());
    }

    public static final Bool2 neq(Float2 float2, Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(!(float2.getX() == b.getX()), !(float2.getY() == b.getY()));
    }

    public static final Bool2 notEqual(Float2 a, Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(!(a.getX() == b.getX()), !(a.getY() == b.getY()));
    }

    public static final Float3 plus(float f, Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(v.getX() + f, v.getY() + f, f + v.getZ());
    }

    public static final Float3 times(float f, Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(v.getX() * f, v.getY() * f, f * v.getZ());
    }

    public static final Float4 abs(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(Math.abs(v.getX()), Math.abs(v.getY()), Math.abs(v.getZ()), Math.abs(v.getW()));
    }

    public static final boolean all(Bool4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() && v.getY() && v.getZ() && v.getW();
    }

    public static final boolean any(Bool4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() || v.getY() || v.getZ() || v.getW();
    }

    public static final float distance(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Float3 float3 = new Float3(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
        return (float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ()));
    }

    public static final Float4 div(float f, Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(f / v.getX(), f / v.getY(), f / v.getZ(), f / v.getW());
    }

    public static final float dot(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ()) + (a.getW() * b.getW());
    }

    /* renamed from: eq */
    public static final Bool3 m51920eq(Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() == f, float3.getY() == f, float3.getZ() == f);
    }

    public static final Bool3 equal(Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() == f, a.getY() == f, a.getZ() == f);
    }

    public static final Bool3 greaterThan(Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() > f, a.getY() > f, a.getZ() > f);
    }

    public static final Bool3 greaterThanEqual(Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() >= f, a.getY() >= f, a.getZ() >= f);
    }

    /* renamed from: gt */
    public static final Bool3 m51914gt(Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() > f, float3.getY() > f, float3.getZ() > f);
    }

    public static final Bool3 gte(Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() >= f, float3.getY() >= f, float3.getZ() >= f);
    }

    public static final float length(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ()) + (v.getW() * v.getW()));
    }

    public static final float length2(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ()) + (v.getW() * v.getW());
    }

    public static final Bool3 lessThan(Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() < f, a.getY() < f, a.getZ() < f);
    }

    public static final Bool3 lessThanEqual(Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() <= f, a.getY() <= f, a.getZ() <= f);
    }

    /* renamed from: lt */
    public static final Bool3 m51908lt(Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() < f, float3.getY() < f, float3.getZ() < f);
    }

    public static final Bool3 lte(Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() <= f, float3.getY() <= f, float3.getZ() <= f);
    }

    public static final float max(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.max(v.getX(), Math.max(v.getY(), v.getZ()));
    }

    public static final float min(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.min(v.getX(), Math.min(v.getY(), v.getZ()));
    }

    public static final Float4 minus(float f, Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(f - v.getX(), f - v.getY(), f - v.getZ(), f - v.getW());
    }

    public static final Bool3 neq(Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(!(float3.getX() == f), !(float3.getY() == f), !(float3.getZ() == f));
    }

    public static final Float3 normalize(Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float sqrt = 1.0f / ((float) Math.sqrt(((v.getX() * v.getX()) + (v.getY() * v.getY())) + (v.getZ() * v.getZ())));
        return new Float3(v.getX() * sqrt, v.getY() * sqrt, v.getZ() * sqrt);
    }

    public static final Bool3 notEqual(Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(!(a.getX() == f), !(a.getY() == f), !(a.getZ() == f));
    }

    public static final Float4 plus(float f, Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(v.getX() + f, v.getY() + f, v.getZ() + f, f + v.getW());
    }

    public static final Float4 times(float f, Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(v.getX() * f, v.getY() * f, v.getZ() * f, f * v.getW());
    }

    /* renamed from: eq */
    public static final Bool3 m51919eq(Float3 float3, Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() == b.getX(), float3.getY() == b.getY(), float3.getZ() == b.getZ());
    }

    public static final Bool3 equal(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() == b.getX(), a.getY() == b.getY(), a.getZ() == b.getZ());
    }

    public static final Bool3 greaterThan(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() > b.getY(), a.getY() > b.getY(), a.getZ() > b.getZ());
    }

    public static final Bool3 greaterThanEqual(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() >= b.getX(), a.getY() >= b.getY(), a.getZ() >= b.getZ());
    }

    /* renamed from: gt */
    public static final Bool3 m51913gt(Float3 float3, Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() > b.getX(), float3.getY() > b.getY(), float3.getZ() > b.getZ());
    }

    public static final Bool3 gte(Float3 float3, Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() >= b.getX(), float3.getY() >= b.getY(), float3.getZ() >= b.getZ());
    }

    public static final Bool3 lessThan(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() < b.getX(), a.getY() < b.getY(), a.getZ() < b.getZ());
    }

    public static final Bool3 lessThanEqual(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() <= b.getX(), a.getY() <= b.getY(), a.getZ() <= b.getZ());
    }

    /* renamed from: lt */
    public static final Bool3 m51907lt(Float3 float3, Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() < b.getX(), float3.getY() < b.getY(), float3.getZ() < b.getZ());
    }

    public static final Bool3 lte(Float3 float3, Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() <= b.getX(), float3.getY() <= b.getY(), float3.getZ() <= b.getZ());
    }

    public static final Float3 max(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float3(Math.max(a.getX(), b.getX()), Math.max(a.getY(), b.getY()), Math.max(a.getZ(), b.getZ()));
    }

    public static final Float3 min(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float3(Math.min(a.getX(), b.getX()), Math.min(a.getY(), b.getY()), Math.min(a.getZ(), b.getZ()));
    }

    public static final Bool3 neq(Float3 float3, Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(!(float3.getX() == b.getX()), !(float3.getY() == b.getY()), !(float3.getZ() == b.getZ()));
    }

    public static final Bool3 notEqual(Float3 a, Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(!(a.getX() == b.getX()), !(a.getY() == b.getY()), !(a.getZ() == b.getZ()));
    }

    public static final Float3 reflect(Float3 i, Float3 n) {
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(n, "n");
        float x = ((n.getX() * i.getX()) + (n.getY() * i.getY()) + (n.getZ() * i.getZ())) * 2.0f;
        Float3 float3 = new Float3(n.getX() * x, n.getY() * x, x * n.getZ());
        return new Float3(i.getX() - float3.getX(), i.getY() - float3.getY(), i.getZ() - float3.getZ());
    }

    public static final Float3 transform(Float3 v, Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        Float3 copy$default = Float3.copy$default(v, 0.0f, 0.0f, 0.0f, 7, null);
        copy$default.setX(block.invoke(Float.valueOf(copy$default.getX())).floatValue());
        copy$default.setY(block.invoke(Float.valueOf(copy$default.getY())).floatValue());
        copy$default.setZ(block.invoke(Float.valueOf(copy$default.getZ())).floatValue());
        return copy$default;
    }

    public static final Float2 clamp(Float2 v, Float2 min, Float2 max) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float x = v.getX();
        float x2 = min.getX();
        float x3 = max.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = v.getY();
        float y2 = min.getY();
        float y3 = max.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        return new Float2(x, y);
    }

    public static final float distance(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Float4 float4 = new Float4(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ(), a.getW() - b.getW());
        return (float) Math.sqrt((float4.getX() * float4.getX()) + (float4.getY() * float4.getY()) + (float4.getZ() * float4.getZ()) + (float4.getW() * float4.getW()));
    }

    /* renamed from: eq */
    public static final Bool4 m51918eq(Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() == f, float4.getY() == f, float4.getZ() == f, float4.getW() == f);
    }

    public static final Bool4 equal(Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() == f, a.getY() == f, a.getZ() == f, a.getW() == f);
    }

    public static final Bool4 greaterThan(Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() > f, a.getY() > f, a.getZ() > f, a.getW() > f);
    }

    public static final Bool4 greaterThanEqual(Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() >= f, a.getY() >= f, a.getZ() >= f, a.getW() >= f);
    }

    /* renamed from: gt */
    public static final Bool4 m51912gt(Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() > f, float4.getY() > f, float4.getZ() > f, float4.getW() > f);
    }

    public static final Bool4 gte(Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() >= f, float4.getY() >= f, float4.getZ() >= f, float4.getW() >= f);
    }

    public static final Bool4 lessThan(Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() < f, a.getY() < f, a.getZ() < f, a.getW() < f);
    }

    public static final Bool4 lessThanEqual(Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() <= f, a.getY() <= f, a.getZ() <= f, a.getW() <= f);
    }

    /* renamed from: lt */
    public static final Bool4 m51906lt(Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() < f, float4.getY() < f, float4.getZ() < f, float4.getW() < f);
    }

    public static final Bool4 lte(Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() <= f, float4.getY() <= f, float4.getZ() <= f, float4.getW() <= f);
    }

    public static final float max(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.max(v.getX(), Math.max(v.getY(), Math.max(v.getZ(), v.getW())));
    }

    public static final float min(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.min(v.getX(), Math.min(v.getY(), Math.min(v.getZ(), v.getW())));
    }

    public static final Float2 mix(Float2 a, Float2 b, Float2 x) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(x, "x");
        float x2 = a.getX();
        float x3 = b.getX();
        float x4 = x.getX();
        float y = a.getY();
        float y2 = b.getY();
        float y3 = x.getY();
        return new Float2((x2 * (1.0f - x4)) + (x3 * x4), (y * (1.0f - y3)) + (y2 * y3));
    }

    public static final Bool4 neq(Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(!(float4.getX() == f), !(float4.getY() == f), !(float4.getZ() == f), !(float4.getW() == f));
    }

    public static final Float4 normalize(Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float sqrt = 1.0f / ((float) Math.sqrt((((v.getX() * v.getX()) + (v.getY() * v.getY())) + (v.getZ() * v.getZ())) + (v.getW() * v.getW())));
        return new Float4(v.getX() * sqrt, v.getY() * sqrt, v.getZ() * sqrt, v.getW() * sqrt);
    }

    public static final Bool4 notEqual(Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(!(a.getX() == f), !(a.getY() == f), !(a.getZ() == f), !(a.getW() == f));
    }

    /* renamed from: eq */
    public static final Bool4 m51917eq(Float4 float4, Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() == b.getX(), float4.getY() == b.getY(), float4.getZ() == b.getZ(), float4.getW() == b.getW());
    }

    public static final Bool4 equal(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() == b.getX(), a.getY() == b.getY(), a.getZ() == b.getZ(), a.getW() == b.getW());
    }

    public static final Bool4 greaterThan(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() > b.getY(), a.getY() > b.getY(), a.getZ() > b.getZ(), a.getW() > b.getW());
    }

    public static final Bool4 greaterThanEqual(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() >= b.getX(), a.getY() >= b.getY(), a.getZ() >= b.getZ(), a.getW() >= b.getW());
    }

    /* renamed from: gt */
    public static final Bool4 m51911gt(Float4 float4, Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() > b.getX(), float4.getY() > b.getY(), float4.getZ() > b.getZ(), float4.getW() > b.getW());
    }

    public static final Bool4 gte(Float4 float4, Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() >= b.getX(), float4.getY() >= b.getY(), float4.getZ() >= b.getZ(), float4.getW() >= b.getW());
    }

    public static final Bool4 lessThan(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() < b.getX(), a.getY() < b.getY(), a.getZ() < b.getZ(), a.getW() < b.getW());
    }

    public static final Bool4 lessThanEqual(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() <= b.getX(), a.getY() <= b.getY(), a.getZ() <= b.getZ(), a.getW() <= b.getW());
    }

    public static final Bool4 lte(Float4 float4, Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() <= b.getX(), float4.getY() <= b.getY(), float4.getZ() <= b.getZ(), float4.getW() <= b.getW());
    }

    public static final Float4 max(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float4(Math.max(a.getX(), b.getX()), Math.max(a.getY(), b.getY()), Math.max(a.getZ(), b.getZ()), Math.max(a.getW(), b.getW()));
    }

    public static final Float4 min(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float4(Math.min(a.getX(), b.getX()), Math.min(a.getY(), b.getY()), Math.min(a.getZ(), b.getZ()), Math.min(a.getW(), b.getW()));
    }

    public static final Bool4 neq(Float4 float4, Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(!(float4.getX() == b.getX()), !(float4.getY() == b.getY()), !(float4.getZ() == b.getZ()), !(float4.getW() == b.getW()));
    }

    public static final Bool4 notEqual(Float4 a, Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(!(a.getX() == b.getX()), !(a.getY() == b.getY()), !(a.getZ() == b.getZ()), !(a.getW() == b.getW()));
    }

    public static final Float3 refract(Float3 i, Float3 n, float f) {
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(n, "n");
        float x = (n.getX() * i.getX()) + (n.getY() * i.getY()) + (n.getZ() * i.getZ());
        float f2 = 1.0f - ((f * f) * (1.0f - (x * x)));
        if (f2 < 0.0f) {
            return new Float3(0.0f);
        }
        Float3 float3 = new Float3(i.getX() * f, i.getY() * f, i.getZ() * f);
        float sqrt = (f * x) + ((float) Math.sqrt(f2));
        Float3 float32 = new Float3(n.getX() * sqrt, n.getY() * sqrt, sqrt * n.getZ());
        return new Float3(float3.getX() - float32.getX(), float3.getY() - float32.getY(), float3.getZ() - float32.getZ());
    }

    /* renamed from: lt */
    public static final Bool4 m51905lt(Float4 float4, Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() < b.getX(), float4.getY() < b.getY(), float4.getZ() < b.getZ(), float4.getW() < b.getW());
    }

    public static final Float4 transform(Float4 v, Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        Float4 copy$default = Float4.copy$default(v, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        copy$default.setX(block.invoke(Float.valueOf(copy$default.getX())).floatValue());
        copy$default.setY(block.invoke(Float.valueOf(copy$default.getY())).floatValue());
        copy$default.setZ(block.invoke(Float.valueOf(copy$default.getZ())).floatValue());
        copy$default.setW(block.invoke(Float.valueOf(copy$default.getW())).floatValue());
        return copy$default;
    }

    public static final Float3 clamp(Float3 v, float f, float f2) {
        Intrinsics.checkNotNullParameter(v, "v");
        float x = v.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = v.getY();
        if (y < f) {
            y = f;
        } else if (y > f2) {
            y = f2;
        }
        float z = v.getZ();
        if (z >= f) {
            f = z > f2 ? f2 : z;
        }
        return new Float3(x, y, f);
    }

    public static final Float3 mix(Float3 a, Float3 b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float f2 = 1.0f - f;
        return new Float3((a.getX() * f2) + (b.getX() * f), (a.getY() * f2) + (b.getY() * f), (a.getZ() * f2) + (b.getZ() * f));
    }

    public static final Float3 clamp(Float3 v, Float3 min, Float3 max) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float x = v.getX();
        float x2 = min.getX();
        float x3 = max.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = v.getY();
        float y2 = min.getY();
        float y3 = max.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        float z = v.getZ();
        float z2 = min.getZ();
        float z3 = max.getZ();
        if (z < z2) {
            z = z2;
        } else if (z > z3) {
            z = z3;
        }
        return new Float3(x, y, z);
    }

    public static final Float3 mix(Float3 a, Float3 b, Float3 x) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(x, "x");
        float x2 = a.getX();
        float x3 = b.getX();
        float x4 = x.getX();
        float f = (x2 * (1.0f - x4)) + (x3 * x4);
        float y = a.getY();
        float y2 = b.getY();
        float y3 = x.getY();
        float z = a.getZ();
        float z2 = b.getZ();
        float z3 = x.getZ();
        return new Float3(f, (y * (1.0f - y3)) + (y2 * y3), (z * (1.0f - z3)) + (z2 * z3));
    }

    public static final Float4 clamp(Float4 v, float f, float f2) {
        Intrinsics.checkNotNullParameter(v, "v");
        float x = v.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = v.getY();
        if (y < f) {
            y = f;
        } else if (y > f2) {
            y = f2;
        }
        float z = v.getZ();
        if (z < f) {
            z = f;
        } else if (z > f2) {
            z = f2;
        }
        float w = v.getW();
        if (w >= f) {
            f = w > f2 ? f2 : w;
        }
        return new Float4(x, y, z, f);
    }

    public static final Float4 mix(Float4 a, Float4 b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float f2 = 1.0f - f;
        return new Float4((a.getX() * f2) + (b.getX() * f), (a.getY() * f2) + (b.getY() * f), (a.getZ() * f2) + (b.getZ() * f), (a.getW() * f2) + (b.getW() * f));
    }

    public static final Float4 clamp(Float4 v, Float4 min, Float4 max) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float x = v.getX();
        float x2 = min.getX();
        float x3 = max.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = v.getY();
        float y2 = min.getY();
        float y3 = max.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        float z = v.getZ();
        float z2 = min.getZ();
        float z3 = max.getZ();
        if (z < z2) {
            z = z2;
        } else if (z > z3) {
            z = z3;
        }
        float w = v.getW();
        float z4 = min.getZ();
        float w2 = max.getW();
        if (w < z4) {
            w = z4;
        } else if (w > w2) {
            w = w2;
        }
        return new Float4(x, y, z, w);
    }

    public static final Float4 mix(Float4 a, Float4 b, Float4 x) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(x, "x");
        float x2 = a.getX();
        float x3 = b.getX();
        float x4 = x.getX();
        float f = (x2 * (1.0f - x4)) + (x3 * x4);
        float y = a.getY();
        float y2 = b.getY();
        float y3 = x.getY();
        float f2 = (y * (1.0f - y3)) + (y2 * y3);
        float z = a.getZ();
        float z2 = b.getZ();
        float z3 = x.getZ();
        float w = a.getW();
        float w2 = b.getW();
        float w3 = x.getW();
        return new Float4(f, f2, (z * (1.0f - z3)) + (z2 * z3), (w * (1.0f - w3)) + (w2 * w3));
    }
}
