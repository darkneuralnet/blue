.class public final synthetic Lut5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lwt5;


# direct methods
.method public synthetic constructor <init>(Lwt5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lut5;->b:Lwt5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lut5;->b:Lwt5;

    invoke-static {v0}, Lwt5;->h(Lwt5;)V

    return-void
.end method
