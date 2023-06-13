.class public final synthetic LVd6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiPredicate;


# instance fields
.field public final synthetic a:LZd6;


# direct methods
.method public synthetic constructor <init>(LZd6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVd6;->a:LZd6;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LVd6;->a:LZd6;

    check-cast p1, Lo0;

    check-cast p2, Lo0;

    invoke-static {v0, p1, p2}, LZd6;->d(LZd6;Lo0;Lo0;)Z

    move-result p1

    return p1
.end method
