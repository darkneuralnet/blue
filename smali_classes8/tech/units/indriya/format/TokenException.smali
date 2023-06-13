.class public Ltech/units/indriya/format/TokenException;
.super Ljavax/measure/format/MeasurementParseException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x28b118038588343dL


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, ""

    invoke-direct {p0, v0}, Ljavax/measure/format/MeasurementParseException;-><init>(Ljava/lang/String;)V

    const-string v0, "line.separator"

    const-string v1, "\n"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltech/units/indriya/format/TokenException;->b:Ljava/lang/String;

    return-void
.end method
