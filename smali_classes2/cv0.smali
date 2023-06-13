.class public final Lcv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbv0;


# instance fields
.field public final a:Ldv0;


# direct methods
.method public constructor <init>(Ldv0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcv0;->a:Ldv0;

    return-void
.end method

.method public static b(Ldv0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv0;",
            ")",
            "LY94<",
            "Lbv0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcv0;

    invoke-direct {v0, p0}, Lcv0;-><init>(Ldv0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Lev0;)Lav0;
    .locals 1

    iget-object v0, p0, Lcv0;->a:Ldv0;

    invoke-virtual {v0, p1, p2}, Ldv0;->b(Lcom/uber/autodispose/ScopeProvider;Lev0;)Lav0;

    move-result-object p1

    return-object p1
.end method
