.class public final synthetic Lku0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BinaryOperator;


# instance fields
.field public final synthetic a:Lou0;


# direct methods
.method public synthetic constructor <init>(Lou0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lku0;->a:Lou0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lku0;->a:Lou0;

    check-cast p1, Lo0;

    check-cast p2, Lo0;

    invoke-static {v0, p1, p2}, Lou0;->d(Lou0;Lo0;Lo0;)Lo0;

    move-result-object p1

    return-object p1
.end method
