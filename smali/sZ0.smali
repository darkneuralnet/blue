.class public final synthetic LsZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/work/impl/background/systemalarm/c;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/background/systemalarm/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsZ0;->b:Landroidx/work/impl/background/systemalarm/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LsZ0;->b:Landroidx/work/impl/background/systemalarm/c;

    invoke-static {v0}, Landroidx/work/impl/background/systemalarm/c;->d(Landroidx/work/impl/background/systemalarm/c;)V

    return-void
.end method
