.class public final synthetic LKw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcD1$l;


# instance fields
.field public final synthetic a:LLw;


# direct methods
.method public synthetic constructor <init>(LLw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKw;->a:LLw;

    return-void
.end method


# virtual methods
.method public final c(LfM2;)Z
    .locals 1

    iget-object v0, p0, LKw;->a:LLw;

    invoke-static {v0, p1}, LLw;->Pl(LLw;LfM2;)Z

    move-result p1

    return p1
.end method
