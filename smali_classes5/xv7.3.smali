.class public final Lxv7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhb9;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    invoke-static {}, Ljp9;->F()Ljp9;

    move-result-object v0

    invoke-static {}, LHi7;->v()LHi7;

    move-result-object v1

    const/4 v2, 0x0

    const v3, 0xc0b2142

    sget-object v4, Lfn9;->m:Lfn9;

    const/4 v5, 0x0

    const-class v6, LHi7;

    invoke-static/range {v0 .. v6}, Lub9;->p(Lpg9;Lpg9;LPb9;ILfn9;ZLjava/lang/Class;)Lhb9;

    move-result-object v0

    sput-object v0, Lxv7;->a:Lhb9;

    return-void
.end method
