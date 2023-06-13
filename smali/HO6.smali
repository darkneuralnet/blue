.class public final synthetic LHO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lbo/app/o;


# direct methods
.method public synthetic constructor <init>(Lbo/app/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHO6;->a:Lbo/app/o;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LHO6;->a:Lbo/app/o;

    check-cast p1, Landroid/location/Location;

    invoke-static {v0, p1}, Lbo/app/o;->b(Lbo/app/o;Landroid/location/Location;)V

    return-void
.end method
