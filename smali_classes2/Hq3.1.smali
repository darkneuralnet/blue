.class public final synthetic LHq3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$c;


# instance fields
.field public final synthetic b:LIq3;


# direct methods
.method public synthetic constructor <init>(LIq3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHq3;->b:LIq3;

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LHq3;->b:LIq3;

    invoke-static {v0, p1}, LIq3;->Zl(LIq3;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
