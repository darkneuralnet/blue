.class public final synthetic LS03;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$c;


# instance fields
.field public final synthetic b:LaZ2;


# direct methods
.method public synthetic constructor <init>(LaZ2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS03;->b:LaZ2;

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LS03;->b:LaZ2;

    invoke-static {v0, p1}, LU03;->Yl(LaZ2;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
