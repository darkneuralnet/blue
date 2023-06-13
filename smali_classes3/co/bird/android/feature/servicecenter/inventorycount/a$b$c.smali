.class public final Lco/bird/android/feature/servicecenter/inventorycount/a$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY94;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/servicecenter/inventorycount/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LY94<",
        "Lwi2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LlG2;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/servicecenter/inventorycount/a$b$c;->a:LlG2;

    return-void
.end method


# virtual methods
.method public a()Lwi2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/a$b$c;->a:LlG2;

    invoke-interface {v0}, LlG2;->m2()Lwi2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi2;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/inventorycount/a$b$c;->a()Lwi2;

    move-result-object v0

    return-object v0
.end method
