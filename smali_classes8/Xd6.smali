.class public final synthetic LXd6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Lo0;


# direct methods
.method public synthetic constructor <init>(Lo0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXd6;->a:Lo0;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXd6;->a:Lo0;

    invoke-static {v0}, LZd6;->c(Lo0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
