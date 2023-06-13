.class public final synthetic LW93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# instance fields
.field public final synthetic b:Ldi0;


# direct methods
.method public synthetic constructor <init>(Ldi0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW93;->b:Ldi0;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LW93;->b:Ldi0;

    check-cast p1, Lci0;

    invoke-static {v0, p1}, Laa3;->e(Ldi0;Lci0;)Z

    move-result p1

    return p1
.end method
