.class public final synthetic Lnu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic b:Lou0;


# direct methods
.method public synthetic constructor <init>(Lou0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnu0;->b:Lou0;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lnu0;->b:Lou0;

    check-cast p1, Lo0;

    check-cast p2, Lo0;

    invoke-static {v0, p1, p2}, Lou0;->b(Lou0;Lo0;Lo0;)I

    move-result p1

    return p1
.end method
