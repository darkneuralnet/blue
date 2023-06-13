.class public final synthetic Ln05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li25;

.field public final synthetic c:Landroid/location/Location;

.field public final synthetic d:Ljava/lang/Float;


# direct methods
.method public synthetic constructor <init>(Li25;Landroid/location/Location;Ljava/lang/Float;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln05;->b:Li25;

    iput-object p2, p0, Ln05;->c:Landroid/location/Location;

    iput-object p3, p0, Ln05;->d:Ljava/lang/Float;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ln05;->b:Li25;

    iget-object v1, p0, Ln05;->c:Landroid/location/Location;

    iget-object v2, p0, Ln05;->d:Ljava/lang/Float;

    invoke-static {v0, v1, v2}, Li25;->b3(Li25;Landroid/location/Location;Ljava/lang/Float;)V

    return-void
.end method
