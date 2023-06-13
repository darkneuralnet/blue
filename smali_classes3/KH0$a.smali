.class public final LKH0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsl0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LKH0$a;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LKH0$a;->a:LKH0$a;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LJH0;)V
    .locals 0

    invoke-direct {p0, p1}, LKH0$a;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lql0;)V
    .locals 0

    invoke-virtual {p0, p1}, LKH0$a;->b(Lql0;)Lql0;

    return-void
.end method

.method public final b(Lql0;)Lql0;
    .locals 1

    new-instance v0, Lvl0;

    invoke-direct {v0}, Lvl0;-><init>()V

    invoke-static {p1, v0}, Lrl0;->b(Lql0;Lvl0;)V

    return-object p1
.end method
