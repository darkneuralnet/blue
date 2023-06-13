.class public final LDJ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrs1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDJ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LDJ0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LDJ0$b;->b:LDJ0$b;

    iput-object p1, p0, LDJ0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LEJ0;)V
    .locals 0

    invoke-direct {p0, p1}, LDJ0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lqs1;)V
    .locals 0

    invoke-virtual {p0, p1}, LDJ0$b;->b(Lqs1;)Lqs1;

    return-void
.end method

.method public final b(Lqs1;)Lqs1;
    .locals 1

    iget-object v0, p0, LDJ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, Lss1;->a(Lqs1;LEa;)V

    return-object p1
.end method
