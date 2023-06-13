.class public final synthetic Lbz5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcz5;


# direct methods
.method public synthetic constructor <init>(Lcz5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbz5;->b:Lcz5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lbz5;->b:Lcz5;

    invoke-static {v0}, Lcz5;->a(Lcz5;)V

    return-void
.end method
