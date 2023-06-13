.class public final synthetic LR03;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$c;


# instance fields
.field public final synthetic b:LT03;


# direct methods
.method public synthetic constructor <init>(LT03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR03;->b:LT03;

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LR03;->b:LT03;

    invoke-static {v0, p1}, LT03;->Yl(LT03;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
