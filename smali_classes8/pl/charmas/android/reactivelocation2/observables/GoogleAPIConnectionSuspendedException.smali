.class public Lpl/charmas/android/reactivelocation2/observables/GoogleAPIConnectionSuspendedException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final cause:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    iput p1, p0, Lpl/charmas/android/reactivelocation2/observables/GoogleAPIConnectionSuspendedException;->cause:I

    return-void
.end method


# virtual methods
.method public getErrorCause()I
    .locals 1

    iget v0, p0, Lpl/charmas/android/reactivelocation2/observables/GoogleAPIConnectionSuspendedException;->cause:I

    return v0
.end method
