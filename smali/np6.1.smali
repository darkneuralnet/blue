.class public final synthetic Lnp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Lrp6;


# direct methods
.method public synthetic constructor <init>(Lrp6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp6;->a:Lrp6;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnp6;->a:Lrp6;

    invoke-static {v0, p1}, Lrp6;->g(Lrp6;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
