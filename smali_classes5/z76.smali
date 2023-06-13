.class public final synthetic Lz76;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe3;


# instance fields
.field public final synthetic b:Landroid/view/Menu;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Menu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz76;->b:Landroid/view/Menu;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lz76;->b:Landroid/view/Menu;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, LA76;->N6(Landroid/view/Menu;Ljava/lang/Boolean;)V

    return-void
.end method
