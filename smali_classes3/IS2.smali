.class public final synthetic LIS2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$c;


# instance fields
.field public final synthetic b:LJS2;


# direct methods
.method public synthetic constructor <init>(LJS2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIS2;->b:LJS2;

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LIS2;->b:LJS2;

    invoke-static {v0, p1}, LJS2;->Yl(LJS2;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
