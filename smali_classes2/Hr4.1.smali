.class public final synthetic LHr4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcD1$n;


# instance fields
.field public final synthetic a:Lma4;


# direct methods
.method public synthetic constructor <init>(Lma4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHr4;->a:Lma4;

    return-void
.end method


# virtual methods
.method public final a(LDX3;)V
    .locals 1

    iget-object v0, p0, LHr4;->a:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method
