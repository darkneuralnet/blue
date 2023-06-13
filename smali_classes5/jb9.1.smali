.class public final synthetic Ljb9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQj9;


# instance fields
.field public final synthetic a:Lwb9;

.field public final synthetic b:Lcb9;

.field public final synthetic c:LYb9;


# direct methods
.method public synthetic constructor <init>(Lwb9;Lcb9;LYb9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb9;->a:Lwb9;

    iput-object p2, p0, Ljb9;->b:Lcb9;

    iput-object p3, p0, Ljb9;->c:LYb9;

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 3

    iget-object v0, p0, Ljb9;->a:Lwb9;

    iget-object v1, p0, Ljb9;->b:Lcb9;

    iget-object v2, p0, Ljb9;->c:LYb9;

    invoke-virtual {v0, v1, v2}, Lwb9;->b(Lcb9;LYb9;)Z

    move-result v0

    return v0
.end method
