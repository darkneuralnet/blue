.class public final synthetic LbG2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/chuckerteam/chucker/internal/ui/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/chuckerteam/chucker/internal/ui/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbG2;->b:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LbG2;->b:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/chuckerteam/chucker/internal/ui/MainActivity;->y(Lcom/chuckerteam/chucker/internal/ui/MainActivity;Z)V

    return-void
.end method
