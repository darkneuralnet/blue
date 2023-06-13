.class public final synthetic LbP5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LaP5;


# direct methods
.method public synthetic constructor <init>(LaP5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbP5;->b:LaP5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LbP5;->b:LaP5;

    invoke-static {v0}, LaP5$d;->a(LaP5;)V

    return-void
.end method
