.class public final synthetic LcE2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LdE2;


# direct methods
.method public synthetic constructor <init>(LdE2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LcE2;->b:LdE2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LcE2;->b:LdE2;

    invoke-static {v0}, LdE2;->a(LdE2;)V

    return-void
.end method
