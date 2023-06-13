.class public final synthetic Lfo3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco3;


# direct methods
.method public synthetic constructor <init>(Lco3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfo3;->b:Lco3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lfo3;->b:Lco3;

    invoke-static {v0}, Lco3$n;->c(Lco3;)V

    return-void
.end method
