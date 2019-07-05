package utils;

import java.awt.Point;

import com.graphicsPrimitives.Util;

public class Transformer {

	public static void Translate(Point[] points, int dx, int dy) {

		for (Point point : points) {
			point.x = point.x + dx;
			point.y = point.y + dy;
		}
	}

	public static void ScaleFromOrigin(Point[] points, double dx, double dy) {

		for (Point point : points) {
			point.x = (int) (point.x * dx);
			point.y = (int) (point.y * dy);
		}
	}

	public static void ScaleFromPoint(Point[] points, double dx, double dy) {

		Point fp = points[0];
		int fx = fp.x;
		int fy = fp.y;

		for (int pos = 0; pos < points.length; ++pos) {
			int xp, yp;
			xp = (int) ((points[pos].x - fx) * dx) + fx;
			yp = (int) ((points[pos].y - fy) * dy) + fy;

			points[pos].x = xp;
			points[pos].y = yp;

		}

	}

	public static void RotateFromOrigin(Point[] points, double angle) {

		angle = Math.toRadians(angle);
		for (Point point : points) {
			int xp, yp;
			xp = Integer.valueOf((int) (point.x * Math.cos(angle) - point.y
					* Math.sin(angle)));
			yp = Integer.valueOf((int) (point.x * Math.sin(angle) + point.y
					* Math.cos(angle)));

			point.x = xp;
			point.y = yp;
		}
	}

	public static void RotateFromPoint(Point[] points, double angle) {

		Point fp = points[0];
		int fx = fp.x;
		int fy = fp.y;
		angle = Math.toRadians(angle);

		for (int pos = 0; pos < points.length; pos++) {
			int xp, yp;
			xp = Integer.valueOf((int) ((fx + ((points[pos].x - fx) * Math
					.cos(angle))) - ((points[pos].y - fy) * Math.sin(angle))));
			yp = Integer
					.valueOf((int) ((int) fy + ((points[pos].x - fx)
							* Math.sin(angle) + (points[pos].y - fy)
							* Math.cos(angle))));

			points[pos].x = xp;
			points[pos].y = yp;

		}

	}

	public static void ShearY(Point[] points, double Shy) {

		for (Point point : points)

			point.y = (int) (point.y + Shy * point.x);

	}

	public static void ShearX(Point[] points, double Shx) {

		for (Point point : points)
			point.x = (int) (point.x + Shx * point.y);

	}

	public static void ShearXY(Point[] points, double Shx, double Shy) {
		ShearX(points, Shx);
		ShearY(points, Shy);

	}

}
