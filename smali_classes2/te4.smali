.class public final Lte4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lse4;


# instance fields
.field public final a:Lue4;


# direct methods
.method public constructor <init>(Lue4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lte4;->a:Lue4;

    return-void
.end method

.method public static b(Lue4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lue4;",
            ")",
            "LY94<",
            "Lse4;",
            ">;"
        }
    .end annotation

    new-instance v0, Lte4;

    invoke-direct {v0, p0}, Lte4;-><init>(Lue4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LsJ4;Lhe4;Lcom/uber/autodispose/ScopeProvider;)Lre4;
    .locals 1

    iget-object v0, p0, Lte4;->a:Lue4;

    invoke-virtual {v0, p1, p2, p3}, Lue4;->b(LsJ4;Lhe4;Lcom/uber/autodispose/ScopeProvider;)Lre4;

    move-result-object p1

    return-object p1
.end method
