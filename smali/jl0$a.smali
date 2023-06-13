.class public final Ljl0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljl0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljl0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/util/CloseGuard;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lgl0;->a()V

    invoke-static {}, Lfl0;->a()Landroid/util/CloseGuard;

    move-result-object v0

    iput-object v0, p0, Ljl0$a;->a:Landroid/util/CloseGuard;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ljl0$a;->a:Landroid/util/CloseGuard;

    invoke-static {v0}, Lil0;->a(Landroid/util/CloseGuard;)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Ljl0$a;->a:Landroid/util/CloseGuard;

    invoke-static {v0}, Lhl0;->a(Landroid/util/CloseGuard;)V

    return-void
.end method
