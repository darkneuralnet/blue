.class public final synthetic Lmt2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Landroid/net/Uri;

.field public final synthetic b:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Ljava/util/function/Function;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmt2;->a:Landroid/net/Uri;

    iput-object p2, p0, Lmt2;->b:Ljava/util/function/Function;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmt2;->a:Landroid/net/Uri;

    iget-object v1, p0, Lmt2;->b:Ljava/util/function/Function;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lnt2;->b(Landroid/net/Uri;Ljava/util/function/Function;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method
