.class public final LU48;
.super LMS7;
.source "SourceFile"


# instance fields
.field public final a:Lfv8;


# direct methods
.method public constructor <init>(Lfv8;)V
    .locals 0

    invoke-direct {p0}, LMS7;-><init>()V

    iput-object p1, p0, LU48;->a:Lfv8;

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    iget-object v0, p0, LU48;->a:Lfv8;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lfv8;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method

.method public final zzd()I
    .locals 1

    iget-object v0, p0, LU48;->a:Lfv8;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
